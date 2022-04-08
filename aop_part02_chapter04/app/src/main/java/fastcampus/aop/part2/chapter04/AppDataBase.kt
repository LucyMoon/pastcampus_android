package fastcampus.aop.part2.chapter04

import androidx.room.Database
import androidx.room.RoomDatabase
import fastcampus.aop.part2.chapter04.dao.HistoryDao
import fastcampus.aop.part2.chapter04.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}