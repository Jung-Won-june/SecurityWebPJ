목적: Apache Webserver기반으로 작동하는 웹을 개발해본다. DB, JQuery, Javascript, html 등을 사용해보고, 웹 취약점 관련 지식을 사용하여 보안적으로 우월한 방법을 사용해 개설해본다.
웹에 추가되는 기능들은 모두 내가 구현해보고 싶은 기능이나, 회원가입이 가능하여 여러 관련 주제로 활동할 수 있는 웹을 개설하는 것이 목적.

Login.html

각 위 아래에 있는 이미지가 연속되게 나오는 연출을 하고 싶었음.
결국 자동 롤링 배너 방식을 선택하여 처음부터 코딩을 하게 되었는데

8/29수정사항
css로 이미지 추가, keyframe으로 이미지를 이동시키는 것 까지는 구현했지만, 연속으로 배너가 나오듯이 이동시키는 것은 아직 구현 못했었음.

8/30수정사항
각 이미지를 하나씩 지정하여 연속으로 이동시키는 것 보다는, 이미지를 묶음으로 지정하여 오직 두개만 준비하면 된다는 것을 이용할 것이다.
화면에 꽉 찰 수 있는 이미지를 2개 저장해놓고 이를 연결하여 하나가 화면 밖으로 사라질 때, 나머지 하나가 그대로 이동하고 있는 상황일테니 그 하나의 뒷부분에 붙여 이동하도록
animation: moveImage 5s linear infinite; 인피니트를 사용하여 구현한다면 쉬울 것이다.
