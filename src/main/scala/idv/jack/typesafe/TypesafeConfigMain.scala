package idv.jack.typesafe

import com.typesafe.config.ConfigFactory

object TypesafeConfigMain {
   def main(args: Array[String]): Unit ={
     val config = ConfigFactory.load()
     println(config.getString("foo.a"))
     println(config.getString("foo.b"))
     println(config.getString("bar.a"))
     println(config.getString("bar.b"))

   }

}
