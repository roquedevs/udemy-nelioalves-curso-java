# Compilação e Interpretação, Código Fonte e Código Objeto e Máquina Virtual

**Código fonte:**
> É o código escrito por um programador usando uma linguagem de programação. Trata-se de um texto compreensível por humanos, mas que precisa ser traduzido para linguagem de máquina (0 e 1) para que o computador o execute.

Exemplo:

```java
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, media;

        System.out.println("Digite o primeiro número: ");
        x = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        y = sc.nextDouble();
        media = (x + y) / 2.0;
        System.out.println("Média: " + media);
        sc.close();
    }
}
```


---


**Processo de Compilação (Ex: C, C++)**
> A tradução do código-fonte é feita inteiramente antes da execução, gerando um arquivo executável nativo para o sistema operacional.

**Etapas do processo:**

1. Código Fonte (`.c`)
2. O compilador faz análise léxica, sintática e semântica do código.
3. O código é convertido em código objeto (`.o` ou `.obj`) — um código parcialmente traduzido
4. O linker junta o código objeto com bibliotecas e dependências
5. Gera o executável final (`.exe`, `.out`, etc.)
6. O executável pode ser rodado diretamente no sistema operacional

*Linguagens que usam essa abordagem compilada: C, C++, Go, Rust*<br>
*Saída: executável nativo*

**Vantagens:**

- Alto desempenho (execução direta em código de máquina)
- Checagem de erros em tempo de compilação
- Não depende de ambiente externo para execução

**Desvantagens:**

- Menor portabilidade (precisa compilar novamente para cada sistema)
- Menor flexibilidade em tempo de execução


---


**Processo de Interpretação (Ex: JavaScript, PHP, Python)**
> O código é executado diretamente linha por linha, sem gerar um executável prévio.

**Etapas do processo:**

1. Código fonte (`.js`, `.php`, `.py`)
2. Passa pelo interpretador da linguagem
3. O interpretador faz a análise léxica, sintática e semântica do código em tempo real. (runtime)
4. Cada instrução é traduzida e executada sob demanda
5. O resultado aparece imediatamente

*Linguagens que usam essa abordagem interpretada: JavaScript, PHP, Python, Ruby*<br>
*Saída: não gera executável; o interpretador deve estar presente para rodar o código*

**Vantagens:**

- Alta flexibilidade (ideal para scripts e testes rápidos)
- Excelente para desenvolvimento web e prototipagem
- Mais portável (o código roda em qualquer sistema com o interpretador)

**Desvantagens:**

- Menor desempenho (traduz e executa em tempo real)
- Erros só são detectados em tempo de execução


---


**Abordagem Híbrida: Compilação + Interpretação (Ex: Java, Kotlin, C#)**
> Um modelo de execução dividido em duas fases principais: uma fase de compilação estática para bytecode e uma fase de execução dinâmica interpretada ou compilada (JIT) por uma máquina virtual.

**Etapas do processo:**

1. Código fonte
> Arquivos como: `.java`, `.kt`, `.cs`
2. Compilação Estática
> O código é passado por um compilador estático da linguagem (ex: `javac`, `kotlinc`, `csc` que realiza análise léxica, sintática e semântica e transforma o código fonte para código bytecode (`.class`, `.dll ou .exe`, `.jar` 
3. Build (Empacotamento)
> Ocorre a construção final do projeto, o empacotamento dos arquivos de bytecode em `.jar`, `.apk`, `.dll`, inclusão de dependências, minificação, geração de metadados, otimizações estáticas
4. Execução pela Máquina Virtual (JVM, CLR)
> A Máquina Virtual carrega o bytecode e inicia a execução de forma interpretada: lê o bytecode e executa instruções uma a uma.
5. Otimização em Tempo de Execução: JIT (Just-In-Time Compilation)
> A VM identifica "hot spots" *(trechos de código executados repetidamente)*, compila esse bytecode em tempo de execução para código de máquina nativo, armazena na memória e executa diretamente melhorando drasticamente o desempenho com otimizações, tais como: Inlining, Loop unrolling e Dead code elimination.


*Linguagens que usam essa abordagem híbrida: Java, Kotlin, C#*<br>
*Saída: bytecode + ambiente de execução (JVM, CLR)*

**Vantagens:**

- Boa performance (com JIT ou AOT)
- Portabilidade (mesmo bytecode roda em qualquer sistema com a VM)
- Combina verificação em tempo de compilação com execução flexível

**Desvantagens:**

- Requer ambiente específico (JVM, .NET)
- Inicialização pode ser mais lenta que um binário nativo