File touchFile = new File( basedir, "src/cloud-templates/test.template" );
File excludeFile = new File( basedir, "src/cloud-tempaltes/exclude.template");

assert touchFile.isFile()
assert !excludeFile.isFile()