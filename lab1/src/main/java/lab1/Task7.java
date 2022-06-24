package lab1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task7 {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        User userObject = new User("John", 21);

        String userJson = null;

        try {
            userJson = objectMapper.writeValueAsString(userObject);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(userJson);
    }
}
