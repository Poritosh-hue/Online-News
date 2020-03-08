package dao;

import database.MyDbConnection;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Created by naim on 3/5/2020.
 */
public class AppUserDao  {

    private Connection con;
    private ResultSet rs;

    public AppUserDao(){
        con = MyDbConnection.getConnection();
    }

}
