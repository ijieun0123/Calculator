
# Calculator 프로젝트

## 소개

**Calculator** 프로젝트는 스프링 5기 과정의 CH 2 계산기 과제로 개발되었습니다. 이 프로젝트는 기본적인 사칙연산을 수행하는 콘솔 기반의 계산기 애플리케이션입니다.

## 기능

- **양의 정수 입력**: 사용자로부터 두 개의 양의 정수를 입력받습니다.
- **사칙연산 선택**: 더하기(➕), 빼기(➖), 곱하기(✖️), 나누기(➗) 중 하나의 연산을 선택합니다.
- **연산 결과 출력**: 선택한 연산에 따라 결과를 계산하고 출력합니다.

## 설치 및 실행 방법

1. **저장소 클론**: 터미널 또는 명령 프롬프트에서 다음 명령어를 실행하여 저장소를 클론합니다.

   ```bash
   git clone https://github.com/ijieun0123/Calculator.git
   ```

2. **프로젝트 디렉토리로 이동**:

   ```bash
   cd Calculator
   ```

3. **필요한 의존성 설치**: Gradle을 사용하여 의존성을 설치합니다.

   ```bash
   ./gradlew build
   ```

4. **애플리케이션 실행**:

   ```bash
   ./gradlew run
   ```

   또는 생성된 JAR 파일을 직접 실행할 수 있습니다.

   ```bash
   java -jar build/libs/Calculator.jar
   ```

## 사용 방법

1. 프로그램을 실행하면 콘솔에 다음과 같은 메시지가 표시됩니다.

   ```
   첫 번째 숫자를 입력하세요:
   ```

2. 첫 번째 양의 정수를 입력한 후, 다음 메시지가 표시됩니다.

   ```
   두 번째 숫자를 입력하세요:
   ```

3. 두 번째 양의 정수를 입력한 후, 다음 메시지가 표시됩니다.

   ```
   수행할 연산을 선택하세요 (➕, ➖, ✖️, ➗):
   ```

4. 원하는 연산 기호를 입력하면 결과가 출력됩니다.

   ```
   결과: [계산 결과]
   ```
   
## 블로그

[[CH 2 계산기 과제] 트러블슈팅 ( 제네릭, 람다식 )](https://velog.io/@cock321/CH-2-%EA%B3%84%EC%82%B0%EA%B8%B0-%EA%B3%BC%EC%A0%9C-%ED%8A%B8%EB%9F%AC%EB%B8%94%EC%8A%88%ED%8C%85-%EC%A0%9C%EB%84%A4%EB%A6%AD-%EB%9E%8C%EB%8B%A4%EC%8B%9D)
