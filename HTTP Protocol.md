# HTTP 프로토콜
##### [참고 : MDN](https://developer.mozilla.org/ko/docs/Web/HTTP/Overview)
-----------------
```
  Hyper-Text Transfer Protocol의 약자로 하이퍼 텍스트를 기반으로 데이터를 전송하는 프로토콜
  
  HTML문서, 이미지, 동영상, 오디오, 텍스트 문서등 다양한 데이터를 전송할 수 있다. 
```
-----------------
## HTTP 응답 코드

##### [응답 코드](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status)
-----------------
## HTTP Request-Line 구조
```
<Method> <요쳥URI> <HTTP 버전>
```
## HTTP 메소드
##### [참고 : RFC7231](https://tools.ietf.org/html/rfc7231#section-4.3.1)
### 1. GET 
```
서버로부터 정보를 조회하기 위해 설계된 메소드

전송할 데이터를 Body로 담지 않고 쿼리스트링을 통해 전송한다.

쿼리 스트링 - 사용자가 입력 데이터를 전달하는 방법, url 주소에 미리 협의된 데이터를 파라미터를 통해 넘기는 것을 말한다.

url의 끝의 ? 이후 parameter = value의 형태로 &로 여러개를 연결하여 전송할 수 있다.

Idempotent(멱등)하게 설계되었다. 즉 동일한 요청을 여러 번 수행해도 같은 결과가 나타난다.
```
### 2. POST
```
리소스를 생성 또는 변경하기 위해 설계된 메소드

전송할 데이터를 Http Body에 담아서 전송한다. 따라서 길이의 제한없이 대용량 데이터 전송이 가능하다.

POST 요청의 경우 요청 헤더의 Content-Type에 요청 데이터 타입을 표시해야한다.

Non-idempotent : 같은 요청을 여러 번 전송해도 응답은 항상 다를 수 있다.
 
```
### 3. PATCH : 리소스의 일부를 업데이트 할 때 사용한다.
### 4. PUT : 리소스 전체를 업데이트 하기 위해서 사용된다. 
### 5. DELETE 

##### 외에도 HEAD, OPTIONS, TRACE, CONNECT 등의 메소드가 존재한다. 각각 목적에 부합하는 메소드를 사용해서 의미를 명확히 하는 것이 좋을 것 같다.
