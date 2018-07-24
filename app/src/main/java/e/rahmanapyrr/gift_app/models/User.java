package e.rahmanapyrr.gift_app.models;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseQuery;
import com.parse.ParseUser;

@ParseClassName("_User")
public class User extends ParseUser {
        public static final String KEY_NAME = "username";
        public static final String KEY_USER = "user";


        public String getUsername(){
            return getString(KEY_NAME);
        }

        public void setUsername(ParseFile username){
            put(KEY_NAME, username);
        }

        public ParseUser getUser(){
            return getParseUser(KEY_USER);
        }

        public void setUser(ParseUser user){
            put(KEY_USER, user);
        }

        public User(){}

        public static class Query extends ParseQuery<User> {
            public Query(){
                super(User.class);
            }

            public Query getTop(){
                setLimit(20);
                return this;
            }

            public Query withUser(){
                include("user");
                return this;
            }

        }
    }

