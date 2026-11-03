package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.cat;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class catCollection {
    private static Gson gson = new Gson();

    public static List<cat> readCats (String filename) throws IOException {
        Path path = Paths.get(filename);
        String read = Files.readString(path);
        Type listType = new TypeToken<List<cat>>(){}.getType();

        List<cat> cats = gson.fromJson(read, listType);

        return cats != null ? cats : new ArrayList<>();
    }

    public static void writeCats (List<cat> cats, String filename) throws IOException {
        Path path = Paths.get(filename);
        String write = gson.toJson(cats);
        Files.write(path, write.getBytes());
    }

}
