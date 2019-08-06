package connection

import slick.driver.MySQLDriver

trait MySQLDBImpl {

  val driver = MySQLDriver

  import driver.api._
// db: Databese ってdbはDatabese型だよってこと？
  val db: Database = MySqlDB.connectionPool

}

private[connection] object MySqlDB {

  // ここのインポートはなぜ、こんなに長く？
  import slick.driver.MySQLDriver.api._
//ここのDatabaseは上のDatabeseとは違って、呼び出したメソッドを使うため？
  val connectionPool = Database.forConfig("mysql")

}