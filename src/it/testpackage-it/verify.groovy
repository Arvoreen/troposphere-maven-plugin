File touchFile = new File( basedir, "src/cloud-templates/test.template" );

assert touchFile.isFile()

touchFile = new File( basedir, "src/cloud-templates/exclude.template" );

assert touchFile.isFile()