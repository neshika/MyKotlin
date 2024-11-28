fun main(){

    val ingredient1 = "яйцо"
    val ingredient2 = "майонез"
    val ingredient3 = "огурцы"
    val ingredient4 = "картошка"
    val ingredient5 = "соль"

    val arrayIngredients = arrayOf("яйцо", "майонез", "огурцы","картошка","соль")
    println("размер списка с ингредиентами : ${arrayIngredients.size}")

    for(i in arrayIngredients){
        println("ингредиент ${arrayIngredients.indexOf(i) + 1} : $i")
    }

}