총 세번 제출함 <br>
첫번째로 제출한 코드는 빨리 풀려고 if-else 로 작성했더니 코드가 깔끔하지 못하고, 중복된 조건처리를 해주는 부분이 있어서 수정했다.
```
fun rob(nums: IntArray): Int {
        if(nums.size == 1) return nums[0]
        val robbed = IntArray(nums.size)

        robbed[0] = nums[0]
        robbed[1] = max(nums[0], nums[1])

        for(i in 2..nums.lastIndex) {
            robbed[i] = max(robbed[i-1], robbed[i-2]+nums[i])
        }

        return robbed[nums.size-1]
    }
```

제출하고 다시 생각해보니.. robbed 배열이 꼭 필요할까? 어차피 max값을 비교하기 위해서는 이전, 그 앞의 이전 두개만 필요한걸..! 하는 생각이 들어서 다시 수정해보았다.
```
fun rob(nums: IntArray): Int {
        if(nums.size == 1) return nums[0]
        if(nums.size == 2) return max(nums[0], nums[1])
        var before = max(nums[0], nums[1])
        var bBefore = nums[0]
        var current = 0

        for(i in 2..nums.lastIndex) {
            current = max(before, bBefore + nums[i])
            bBefore = before
            before = current
        }

        return current
    }
```

코드는 훨씬 간결한데.. 어째서 런타임과 메모리가 더 나빠지는건지는 모르겠다ㅠ
