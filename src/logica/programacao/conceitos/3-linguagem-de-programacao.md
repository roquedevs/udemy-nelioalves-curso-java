# Linguagem de Programação – Análise Léxica e Sintática

**Linguagem de Programação**
> Conjunto de regras léxicas e sintáticas que definem como escrever instruções compreensíveis, lógicas e sequenciais para um programa de computador.

**Análise Léxica**
> Diz respeito à identificação e classificação dos tokens (palavras ou símbolos válidos) no código fonte, como identificadores, palavras-chave, números, símbolos, etc.
*(Pode ser comparado à ortografia na linguagem natural.)*

Exemplo:

- cachorro ✔️ vs caxorro ❌
-     main ✔️ vs maim ❌

**Análise Sintática**
> Diz respeito à análise da estrutura das instruções no código, verificando se os tokens estão organizados de acordo com as regras da linguagem (como a ordem correta de palavras-chave, operadores e variáveis).
*(Pode ser comparado à gramática na linguagem natural.)*

Exemplo:

- `int x = 2 + y;` ✔️
- `int x = + 2 y;` ❌

**Exemplos de Linguagens de Programação**
> C, C++, C#, Java, JavaScript, TypeScript, Python, PHP, Ruby etc...


---


**Exemplo de um programa**
> Suponha um programa que solicita ao usuário dois números e depois mostra a média aritmética deles:

```bash
Digite o primeiro número: 3
Digite o segundo número: 6

Media: 4.5
```

**Solução do programa em Linguagem C**

```c
#include <stdio.h>

int main() {
    double x, y, media;

    printf("Digite o primeiro número: ");
    scanf("%lf", &x);
    printf("Digite o segundo número: ");
    scanf("%lf", %y);
    media = (x + y) / 2.0;
    printf("Media: %.1f\n", media);
    return 0;
}
```

**Solução do programa em Linguagem C++**

```cpp
#include <iostream>

using namespace std;

int main() {
    double x, y, media;

    cout << "Digite o primeiro número: ";
    cin >> x;
    cout << "Digite o segundo número: ";
    cin >> y;
    media = (x + y) / 2.0;
    cout << "Media: " << media << endl;
    return 0;
}
```


**Solução do programa em Linguagem C#**

```csharp
using System;

namespace programa {
    class Programa {
        static void Main(string[] args) {
            double x, y, media;

            Console.Write("Digite o primeiro número: ");
            x = double.Parse(Console.ReadLine());
            Console.Write("Digite o segundo número: ");
            y = double.Parse(Console.ReadLine());
            media = (x + y) / 2.0;
            Console.Write("Media: " + media);
        }
    }
}
```

**Solução do programa em Linguagem Java**
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
        System.out.println("Media: " + media);
        sc.close();
    }
}
```
