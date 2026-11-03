package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import models.Cat;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class catCollection {
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static List<Cat> readCats (String filename) throws IOException {
        Path path = Paths.get(filename);
        String read = Files.readString(path);
        Type listType = new TypeToken<List<Cat>>(){}.getType();

        List<Cat> Cats = gson.fromJson(read, listType);

        return Cats != null ? Cats : new ArrayList<>();
    }

    public static void writeCats (List<Cat> Cats, String filename) throws IOException {
        Path path = Paths.get(filename);
        String write = gson.toJson(Cats);
        Files.write(path, write.getBytes());
    }

}
