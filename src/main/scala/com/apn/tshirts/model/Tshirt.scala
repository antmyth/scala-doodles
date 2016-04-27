package com.apn.tshirts.model

import java.net.URL
import java.time.LocalDate


case class TShirt(id:String, name:String, dateBought:LocalDate, images:List[Image])

case class Image(url: URL, description:String)

object TShirtDispenser{

}

class TShirtDispenser(shirts:List[TShirt]){
  def find(id:String):TShirt = ???
  def add(shirt:TShirt):TShirtDispenser = ???
}