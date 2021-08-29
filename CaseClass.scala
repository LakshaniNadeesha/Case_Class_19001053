object CaseClass extends App{

  val p1 = Point(1,2)
  val p2 = Point(3,5)
  //move p1 by distance 3 and 3
  val p3 = p1.move(3,3)
  //get distance between p3 and p2 points
  val p4 = p3.distance(p2)

  println("P1: " + p1)
  println("P2: " + p2)
  //add p1+p2
  println("P1+P2: " + (p1+p2))
  println("Moving P1 by distance 3 and 3 (P3) : " + p3)
  println("Distance between P3 and P2: " + p4)
  //switch the coordinates of p2
  println("After switching x and y coordinates of P2: " + p2.invert())

}

case class Point (a: Int, b:Int){

  var x = a
  var y = b

  def + (that: Point) = Point(this.x + that.x, this.y + that.y)

  def move (dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

  def distance (that: Point) = Point(this.x - that.x, this.y - that.y)

  def invert () = Point(this.y, this.x)

}
