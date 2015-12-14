/**
 * Created by junjaytan on 12/13/15.
 */

// Get current directory
baseDir = System.getProperty("user.dir");
print(baseDir)

// Write file to current directory
new File(baseDir,'haiku.txt').withWriter('utf-8') { writer ->
    writer.writeLine 'Into the ancient pond'
    writer.writeLine 'A frog jumps'
    writer.writeLine 'Water’s sound!'
}

// Read from file
new File(baseDir, 'haiku.txt').eachLine {
    line -> println line
}
