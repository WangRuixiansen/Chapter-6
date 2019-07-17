package com.byted.camp.todolist.db;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量 DONE

    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE "+Todo.TABLE_NAME+" ("+Todo._ID+" INTEGER PRIMARY KEY,"+Todo.TODO_THING+" TEXT,"+Todo.DATE+" DATE,"+Todo.HAVE_DONE+" INTEGER)";
    private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS "+Todo.TABLE_NAME;

    private TodoContract() {
    }
    public static class Todo implements BaseColumns {
        public static final String TABLE_NAME = "TodoList";
        public static final String TODO_THING = "TodoThing";
        public static final String DATE = "Date";
        public static final String HAVE_DONE = "HaveDone";
    }

    public static String getSqlCreateEntries() {
        return SQL_CREATE_ENTRIES;
    }

    public static String getSqlDeleteEntries() {
        return SQL_DELETE_ENTRIES;
    }

}
