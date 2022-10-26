fun main(args: Array<String>){}
open class Point {
    constructor() {
        this.x = 0.0
        this.y = 0.0
    }
    constructor(x: Double, y: Double) {
        this.x = x
        this.y = y
    }
    var x: Double
    var y: Double
}
class ColoredPoint: Point {
    constructor() {
        this.color = "#7FFFD4"
    }
    constructor(x: Double, y: Double, color: String) {
        this.color = color
    }
    var color: String
}
open class Line(a: Point, b: Point) {
    var a: Point = a
    var b: Point = b
}
class ColoredLine(a: Point, b: Point, color: String): Line(a, b) {
    var color: String = color
}

class Polygon(Points: List<Point>) {
    var Points: List<Point> = Points

    open fun MoveX(PointX: Double) {
        Points.forEach {
            it.x += PointX
        }
    }
    open fun MoveY(PointY: Double) {
        Points.forEach {
            it.y += PointY
        }
    }

    open fun MoveXY(PointX: Double, PointY: Double) {
        Points.forEach {
            it.x += PointX
            it.y += PointY
        }
    }
}
