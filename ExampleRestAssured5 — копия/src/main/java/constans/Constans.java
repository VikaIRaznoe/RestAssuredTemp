package constans;

import static constans.Constans.Servers.*;

public class Constans {
    public static class RunVariable{
        public static String server = JSON_PLACEHOLDER_URL;
        //public static String server = REQUESTBIN_URL;
        //public static String path = SWAPI_PATH;
        public static String path = "";
    }

    //Для тестирования разных проектов
    public static class Servers{
        public static String SWAPI_URL = "https://swapi.co/";
        public static String GOOGLE_PLACES_URL;
        public static String JSON_PLACEHOLDER_URL = "https://jsonplaceholder.typicode.com";
        public static String REQUESTBIN_URL = "https://endba9xjjxcym.x.pipedream.net/";
    }

    public static class Path{
        //public static String SWAPI_PATH = "api/";
        public static String GOOGLE_PLACES_PATH;
    }

    public static class Actions{
        //для SWAPI
        public static String SWAPI_GET_PEOPLE = "people/";

        //для GOOGLE PLACES
        public static String GOOGLE_PLACES_URL;

        //JsonPlaceHolder
        public static String JSONPLACEHOLDER_GET = "comments/";
        public static String JSONPLACEHOLDER_PUT = "posts/1";
        public static String JSONPLACEHOLDER_DELETE = "posts/1";
        public static String JSONPLACEHOLDER_POST = "posts/";
    }
}