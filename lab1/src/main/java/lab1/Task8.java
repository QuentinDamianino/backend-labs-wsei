package lab1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task8 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        String userJson = "{\"name\":\"John\",\"age\":21}";

        User userObject = null;

        try {
            userObject = objectMapper.readValue(userJson, User.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        System.out.println(userObject.getName());
        System.out.println(userObject.getAge());
    }
}
