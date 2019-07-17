package com.byted.camp.todolist.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.byted.camp.todolist.db.TodoContract.Todo.DATE;
import static com.byted.camp.todolist.db.TodoContract.Todo.HAVE_DONE;
import static com.byted.camp.todolist.db.TodoContract.Todo.TABLE_NAME;
import static com.byted.camp.todolist.db.TodoContract.Todo.TODO_THING;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public class TodoDbHelper extends SQLiteOpenHelper {

    // TODO 定义数据库名、版本；创建数据库 DONE
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "TodoList.db";
    public TodoDbHelper(Context context) {
        super(context, "DATABASE_NAME", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        for(int i = oldVersion; i < newVersion; i++){
            switch (i){
                case(1):
                    try {
                        db.execSQL("ALTER TABLE "+TABLE_NAME+" ADD "+TODO_THING+" text"+" ADD "+DATE+" long"+" ADD "+HAVE_DONE+" integer");
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                default:

                    break;
            }
        }
    }

}
