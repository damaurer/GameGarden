package de.maurer.gamegarden.config

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.core.DefaultDockerClientConfig
import com.github.dockerjava.core.DockerClientConfig
import com.github.dockerjava.core.DockerClientImpl
import com.github.dockerjava.httpclient5.ApacheDockerHttpClient
import com.github.dockerjava.transport.DockerHttpClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.Duration

/**
 * This class represents the configuration for Docker client connections.
 * It provides three main beans: dockerClientConfig, dockerHttpClient, and dockerClient.
 *
 * https://github.com/docker-java/docker-java/blob/main/docs/getting_started.md
 */
@Configuration
class DockerConfig {

    @Value("\${DOCKER_HOST}")
    lateinit var host: String

    @Value("\${DOCKER_TSL}")
    var tsl: Boolean = true

    @Value("\${DOCKER_CERT_PATH}")
    lateinit var certPath: String


    @Bean
    fun dockerClientConfig(): DockerClientConfig{
        return DefaultDockerClientConfig.createDefaultConfigBuilder()
            .withDockerHost(host)
            .withDockerTlsVerify(tsl)
            .withDockerCertPath(certPath)
            .build()
    }

    @Bean
    fun dockerHttpClient(config: DockerClientConfig): DockerHttpClient {
        return ApacheDockerHttpClient.Builder()
            .dockerHost(config.dockerHost)
            .sslConfig(config.sslConfig)
            .maxConnections(100)
            .connectionTimeout(Duration.ofSeconds(30))
            .responseTimeout(Duration.ofSeconds(45))
            .build()
    }

    @Bean
    fun dockerClient(config: DockerClientConfig, httpClient: DockerHttpClient): DockerClient {
        return DockerClientImpl.getInstance(config, httpClient)
    }
}