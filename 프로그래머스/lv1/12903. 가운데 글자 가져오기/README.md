# [level 1] 가운데 글자 가져오기 - 12903 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12903) 

### 성능 요약

메모리: 64.7 MB, 시간: 8.46 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

<br/>정확성: 100.0<br/>합계: 100.0 / 100.0

### 문제 설명

<p>단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.</p>

<h6>재한사항</h6>

<ul>
<li>s는 길이가 1 이상, 100이하인 스트링입니다.</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>s</th>
<th>return</th>
</tr>
</thead>
        <tbody><tr>
<td>"abcde"</td>
<td>"c"</td>
</tr>
<tr>
<td>"qwer"</td>
<td>"we"</td>
</tr>
</tbody>
      </table>
      
* * *
### Comment
<pre> 
제출 후에 어떻게하면 분기를 안태우고 공식을 세울까 고민해보고 다시 제출했다.
통과하기는 했지만 0.01 ms -> 8.46 ms 가 됐다.
아..공통식보다 분기를 태우는게 더 나을수도 있겠구나.. 코드가 짧은게 꼭 최선은 아니었다.

slice 는 내부적으로 substring 을 호출한다.
kotlin 에서 재공하는 range expression 을 subString 의 parameter 로 넘겨줄 수 있다. 
이럴때는 내부적으로 endIndex+1 이 된다.

추가로 repeat(), chunked(), require(), check() 함수를 알게됐다. 얼른..케이콜 코드에 적용해봐야겠음

</pre>

* * *


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
