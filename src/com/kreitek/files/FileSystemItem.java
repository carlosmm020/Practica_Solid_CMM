package com.kreitek.files;

import java.util.List;

public interface File {
    String getName();

    void setName(String name);

    Directory getParent();

    void setParent(Directory directory);

    String getFullPath();

    String getExtension();

    int getSize();

    void setFileAccessStrategy(FileAccessStrategy fileAccessStrategy);

    void performOperation();
}

public interface Directory {
    String getName();

    void setName(String name);

    Directory getParent();

    void setParent(Directory directory);

    String getFullPath();

    List<File> listFiles();

    void addFile(File file);

    void removeFile(File file);

    List<Directory> listDirectories();

    void addDirectory(Directory directory);

    void removeDirectory(Directory directory);
}

public interface FileAccess {
    void open();

    void close();

    void setPosition(int numberOfBytesFromBeginning);

    byte[] read(int numberOfBytesToRead);

    void write(byte[] buffer);
}

public interface FileList {
    List<File> listFiles();

    List<Directory> listDirectories();
}

public class FileImpl implements File {
    private String name;
    private Directory parent;
    private String fullPath;
    private String extension;
    private FileAccess fileAccess;
    // ...

    @Override
    public void performOperation() {
        fileAccess.open();
        // perform operation
        fileAccess.close();
    }

    // getters and setters
}

public class DirectoryImpl implements Directory {
    private String name;
    private Directory parent;
    private String fullPath;
    private List<File> files;
    private List<Directory> directories;
    // ...

    // getters and setters
}

public class FileListImpl implements FileList {
    private List<File> files;
    private List<Directory> directories;
    // ...

    // getters and setters
}

public class FileAccessImpl implements FileAccess {
    // ...
}

public class FileSystemImpl implements FileSystem {
    private Directory rootDirectory;
    // ...

    // getters and setters
}
