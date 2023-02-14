fun main(){
    print("Введите координату x первой точки: ")
    val x1=readLine().toString().toInt()
    print("Введите координату y первой точки: ")
    val y1=readLine().toString().toInt()
    print("Введите координату x второй точки: ")
    val x2=readLine().toString().toInt()
    print("Введите координату y второй точки: ")
    val y2=readLine().toString().toInt()
    val k = (y1 - y2) / (x1 - x2)
    val b = (y2 - k * x2)
    println( "Уравнение прямой равно: y = $k * x + $b")
}