# GameGarden

GameGarden is a monolith application designed to handle GameServer Docker Containers. The application allows users to
deploy, start, stop, update, and delete GameServer Docker containers seamlessly. The application is divided into user
groups for better management and is configured through a Svelte.js PWA.

## Table of Contents

1. [Tech Stack](#tech-stack)
2. [Feature - GameServer Docker Container Management](#feature---gameserver-docker-container-management)
    - [Feature Set](#feature-set)
3. [Feature - Automated Git-based GameServer World Backups](#feature---automated-git-based-gameserver-world-backups)
    - [Prerequisites](#prerequisites)
    - [Backup Process](#backup-process)
4. [User Management Features](#feature---user-management)
    - [Feature - User Management](#user-management)
5. [Getting Started](#getting-started)
6. [Development Status Checklist](#development-status-checklist)
7. [Contributing](#contributing)
8. [License](#license)


## Tech Stack

The GameGarden application is built using a host of modern technologies including:

- **Spring Boot**: For back-end logic and functionalities.
- **Apache Derby**: As a part of the database system for handling data storage and management.
- **Svelte.js PWA**: To build a reliable, fast and engaging user interface that can work offline and load quickly.
- **Docker**: For containerizing the applications.
- **Spring Security**: For secure user management.

## Feature - GameServer Docker Container Management

GameGarden allows comprehensive management of GameServer Docker container operations. The operations are designed to be
simple, efficient, and safe for users. All handled via a secure user interface in a manner similar to the backup system.
Each feature functions with its distinct user and token system for improved security.

### Feature Set

1. **Deploy**: An easy-to-follow and automated process to deploy GameServer, designed for swift setup with minimal user
   intervention.
2. **Start & Stop**: GameGarden allows users to start or stop GameServer effortlessly. The operations are designed for
   immediate response upon command.
3. **Update**: Keeping your GameServer up-to-date is easily handled through GameGarden's update functionality, also
   incorporating user-token security.
4. **Delete**: GameGarden provides options to delete redundant GameServer. It's designed for easing system management
   and maintaining space efficiency.
5. **User Management**: Secure user management is executed using Spring Security. Which provides a secure layer of
   protection and access control for the varying tiers of users.

To make the most of these features, make sure to set each operation with the corresponding user and security token as
required. This will ensure smooth running, higher security, and better management of your GameServer Docker container
operations.

## Feature - Automated Git-based GameServer World Backups

GameGarden has an invaluable feature that allows for automated Git-based world backups for the game servers. This
procedure ensures consistent backups of game data, whether for restoring prior game states or protecting against data
loss.

This system is designed around Git LFS (Large File Storage), an open-source tool used for handling and versioning larger
files. A unique aspect of this process is that each backup functions through its own dedicated Git user, with token
authentication for enhanced security.

### Prerequisites

- Ensure Git and Git LFS are installed and properly set up.
- Each game server should have an initialized local Git LFS repository.
- The automated backup is enabled with a dedicated Git user and token.

### Backup Process

The backup process is automated and designed to be hands-off once set up:

1. **Prepare the Game World Data**: At regular intervals, the system automatically saves the current state of the game
   world data in a backup directory.
2. **Commit the Game World Data to Git LFS**: The system then automatically stages and commits this saved game world
   data to the local Git LFS repository on the server.
3. **Push Game World Data to Remote Repository**: Finally, the commits are pushed to a remote Git repository using the
   Git user and token. This preserves the backup at an offsite location.
4. **Restore Game World Data**: If you need to restore game world data, you can clone the Git LFS repository and check
   out the required commit, either manually or automated through a complementary system.

This process ensures the safe and effective backup of game world data, with the added convenience of being completely
automated. Simply enable it with the desired Git user and token, and enjoy peace of mind.

**NOTE**: The frequency of automatic backups should be configured based on the specific needs of your game server. More
frequently updated worlds may require more frequent backups to prevent significant data loss.

## Feature - User Management

GameGarden provides a robust and secure user management system, developed using Spring Security. This system allows for
various levels of control and privileges through the implementation of roles and groups, contributing to a versatile and
customizable security model.

### User Management

1. **User Roles**: Each user in GameGarden is assigned a specific "Role". Roles are used to define the level of access
   or control a user has within the system. Examples of roles can be "Admin", "Moderator", "Player", etc., each with its
   defined set of access rights.

2. **User Groups**: Users can be grouped together based on certain criteria or requirements. These "Groups" allow for
   easier management and targeted control within the system. For instance, a group could be all moderators or players of
   a specific game.

3. **Admin Configurations**: As an admin of the GameGarden system, you have the ability to configure these roles and
   groups as per your requirements. This ensures that your system is tailored according to your needs, enhancing both
   security and operational efficiency.

4. **PWA** : Configurations can be done conveniently through the PWA (Progressive Web App). The app provides a
   user-friendly interface and real-time sync capabilities, making the configuration process seamless.

Implementing these features adds a solid layer of security and control to your GameGarden setup, allowing you to focus
on what's important - gaming!

Please note that although roles, groups, and other configurations provide an added measure of control and security, it's
critical to protect any associated tokens or sensitive details from potential threats. Always store such information
securely and never disclose them in any public or shared space, such as project files or READMEs.

## Getting Started

TODO

## Development Status Checklist

The following checklist contains major development tasks for the GameGarden system:

1. [] **Docker Integration**
    - [] Docker setup and configuration
    - [] Deployment of GameServer Docker containers
    - [] Starting and stopping GameServer Docker containers
    - [] Updating GameServer Docker containers
    - [] Deleting redundant GameServer Docker containers

2. [] **User Management**
    - [] Setting up Spring Security
    - [] Creating different user roles and privileges
    - [] Grouping users for easier management
    - [] Enabling admin to configure roles and groups
    - [] Implementing token-based security measures

3. [] **PWA (Progressive Web App) with Svelte.js**
    - [X] Setting up the Svelte environment
    - [] Developing the user interface with Svelte.js
    - [] Implementing real-time synchronization
    - [] Ensuring that the PWA works seamlessly on different platforms
    - [] Implementing PWA features for offline use and native-like feel

4. [] **Apache Derby Setup**
    - [X] Installing Apache Derby
    - [X] Configuring the Derby environment
    - [] Setting up database schema
    - [] Implementing CRUD operations
    - [] Establishing connection with the application


## Contributing

TODO

## License

MIT

Happy gaming with GameGarden!