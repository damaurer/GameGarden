import Keycloak from 'keycloak-js';

const keycloak = new Keycloak({
    url: 'http://127.0.0.1:8443', // Ihre Keycloak Server URL
    realm: 'gamegarden',
    clientId: 'gamegarden-svelte-pwa',
});

export default keycloak;