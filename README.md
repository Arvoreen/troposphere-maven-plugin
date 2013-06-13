This is a maven plugin that can help automate the creation of [AWS CloudFormation][] templates through the use of [Jython][] 
and the [Boto][] and [Troposphere][] Python libraries.

Usage is pretty easy

Include the following in your  pom.xml

     <build>
      <plugins>
        <plugin>
          <groupId>com.salsalabs</groupId>
          <artifactId>troposphere-maven-plugin</artifactId>
          <version>0.8.2</version>
          <executions>
            <execution>
              <phase>generate-sources</phase>
              <goals>
                <goal>tropo</goal>
              </goals>
            </execution>
          </executions>
        </plugin>
      </plugins>
    </build>

You also need to include a dependency in your project to the Jython artifact

    <dependencies>
      <dependency>
        <groupId>org.python</groupId>
        <artifactId>jython-standalone</artifactId>
        <version>2.7-b1</version>
      </dependency>
    </dependencies>

Note that version 2.7-b1 or newer is required.

This plugin will operate during the generate-sources phase of the Maven lifecycle.  It will scan your source directory (default: src/main/tropopsophere) for
files with a '.tr' extension.  It will process each file via Jython, with both Boto and Troposphere modules loaded by default (you can add additional modules if you need them)

The 'stdout' of each Python script (.tr file) will be captured as a cloud-template in the output directory (default: src/cloud-templates) with the same name.  
The output directory is added to the list of source directories for the project.

For some examples, checkout the 'src/it' directory

[AWS CloudFormation]: http://aws.amazon.com/cloudformation
[Boto]: https://github.com/boto/boto
[Troposphere]: https://github.com/cloudtools/troposphere
[Jython]: http://www.jython.org/
