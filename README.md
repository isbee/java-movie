# java-movie
n개의 영화를 예매하고, 할인률/포인트 사용에 따른 예매 금액을 보여주는 (표준 입출력) 프로그램

## 기능 요구사항
1.영화 기본 정보로 아래의 항목이 주어진다.
    * 영화 아이디
    * 영화 제목 
    * 요금
    * 상영 시작 시간
    * 상영 시간별 예매 가능 인원
2. 영화는 한번에 여러 영화를 예매할 수 있어야 한다.
    * 단, 일행이 각자의 취향에 따라 다른 영화를 예매한다고 가정한다. 
    * 따라서 여러 영화를 예매할 경우 각 영화의 시작 시간 차이가  1시간 이상 차이가 날 수 없다.
3. 예매가 가능한 상태이면 결제를 진행한다.
4. 예매가 불가능한 경우 그 이유를 보여주고, 다시 예매할 수 있  도록 해야 한다.
    * 상영 시작 시간이 이미 지난 영화를 선택하는 경우
    * 예매 가능 인원을 초과하는 경우
    * 두 영화의 시간 차이가 1시간 이내가 아닌 경우 
    * 상영목록에 없는 영화를 선택한 경우
5. 결제 유형에 따라 할인율이 달라지고, 포인트를 사용할 수 있다.
    * 결제할 때 적립되어 있는 포인트를 사용할 수 있다. 
    * 신용카드는 5%, 현금 결제는 2% 할인된다.  할인은 포인트를 제외한 금액에 적용한다.
6. 최종 예매 금액을 보여준다.

## 구현된 기능 목록
1. 사용자로 부터 받는 입력은 숫자이면서 null이 아니여야 한다
2. 각 예약할 영화 번호 입력값은 모두 null이 아니고, 존재하는 영화를 가리켜야 한다.
3. 예약할 영화 번호를 입력 받는다
4. 입력받는 예약할 시간표는 존재하는 값이어야 한다
5. 각 영화별 예약할 시간표를 구분기호을 기준으로 입력 받는다
6. 두 영화의 시간 차이가 1시간 이내여야 한다

## 유의사항
* 예약할 영화/ 예약할 시간표를 입력받을 때, **한번에 모든 것을 입력받도록 구현했습니다.**
    * *2. 영화는 한번에 여러 영화를 예매할 수 있어야 한다.* 를 읽고 급하게 구현하느라 문제를 끝까지 읽지 못했고, 문제 의도와 다르게 이런식으로 구현해버렸습니다. 