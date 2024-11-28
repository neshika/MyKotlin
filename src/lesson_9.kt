fun main(){

    val list: List<Int> = listOf(11,3,33,56)
    val list2: MutableList<Int> = mutableListOf(11,3,55,78)

    list2.add(66) // если 1 значение,. то только добавление
    println(list2)

    list2.add(3,11) /* если 2 значения, то добавление по индексу(1 значение индекс, 2 значение число) */
    println(list2)

    println(list2.indexOf(11)) // найти первый индекс у значения 11
    println(list2.lastIndexOf(11)) // найти последний индекс у значения 11


}