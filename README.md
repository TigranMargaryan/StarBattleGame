# StarBattleGame
- This my first Java game. The game about a spaceship that must shoot at enemies and pass levels

-------

### Technologies
* Java 8
* JDBC
* MySQL

-------


### Environment setup

 * [Download Java SE8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
 * Install Java
 * [Download MySql](https://dev.mysql.com/downloads/mysql/)
 * [Install MySql](https://dev.mysql.com/doc/mysql-installer/en/)

-------

### Structure

```
├── src
|   ├── animations---------# allows to animate the picture
|   ├── myclasses---------# classes allow to move the ship and bullet
|   └── myfirstgame------------------# base classes and data layer
└── res------------------# all images and sounds
```
-------

### Configure MySQL DB
Open MySQL Workbench and create new schema, name `game_score`. Click `Server` button in the menu bar chose `Data import`. Go to the StarBattleGame folder and add Scope folder in the MySQL impoert file. Click Start Import button.
