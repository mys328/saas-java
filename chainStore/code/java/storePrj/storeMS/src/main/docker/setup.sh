#!/bin/sh
java -Dloader.path="/commonPrj/init/libs/" -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/logs/memoryError.log -Xms512m -Xmx512m -Xss228k -jar /commonPrj/init/@project.build.finalName@.@project.packaging@