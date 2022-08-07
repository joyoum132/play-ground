import java.util.*
fun main(args: Array<String>) = with(Scanner(System.`in`)) {

    val size = nextInt()
    val student = IntArray(size) //(0, 1, 1, 3, 2)
    for (i in 0 until size) {
        student[i] = nextInt()
    }

    /* NOTE
    기존에 arrayList 방식처럼 res[0] = 1 처럼 사용할 경우 index out of bound 발생.
    당연하지만 linkedList 를 자주 사용하지 않아서 실수하게 되었다.
    linkedList 에서 특정 위치에 값을 insert 하는 경우, 현재의 순서를 유지하면서 특정 위체어 값을 insert 하려는 경우
    .add 를 사용해야 한다.
    index 를 통한 접근은 그 위치만을 update 시켜줄 뿐이다.
    */
    val res = LinkedList<Int>()
    res.add(1)

    for(i in 1 until size) {
        val num = student[i]
        if(num == 0) res.add(i+1)
        else res.add(i-num, i+1)
    }

    res.forEach { print("$it ") }
}