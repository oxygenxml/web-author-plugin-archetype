# web-author-plugin-archetype
This is a maven archetype for a sample oXygen Web Author Plugin

## Creating the project
In order to create a sample plugin project, use the following command:

```
mvn "org.apache.maven.plugins:maven-archetype-plugin:2.4:generate" "-DarchetypeGroupId=com.oxygenxml" "-DarchetypeArtifactId=web-author-plugin-archetype" "-DarchetypeVersion=24.0" "-DarchetypeRepository=https://raw.githubusercontent.com/oxygenxml/web-author-plugin-archetype/mvn-repo/"
```

You will be asked to fill in details about your project.

## Packaging your plugin

To create the plugin archive run the following command in the plugin's folder:

```
mvn package
```

The archive will be found in the `target/` folder with a name ending in `-plugin.jar`.

## Deploying your plugin

To deploy your plugin, you need to [upload it in the Web Author's Administration Page](https://www.oxygenxml.com/doc/ug-webauthor/topics/webapp-configure-plugins.html).
