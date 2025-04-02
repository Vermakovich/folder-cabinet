package org.example.foldercabinet;

import java.util.List;

interface MultiFolder extends Folder {
    List<Folder> getFolders();
}
