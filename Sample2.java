private Path getFilePath(String path) { return baseDirPath.map(dir -> dir.resolve(path)).orElseGet(() -> Paths.get(path)); }
