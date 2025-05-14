

```mermaid
classDiagram

    class EstrategiaCalculo {
        <<interface>>
        +calcular(): int
    }

    class CalculoAlquilerFijo {
        <<interface>>
        +calcular(): int
    }

    class CalculoAlquilerPorcentaje {
        <<interface>>
        +calcular(): int
    }

     class CalculoAlquilerPorcentajeFijo {
        <<interface>>
        +calcular(): int
    }

    class ElementoAlquiler {
        <<abstract>>
        -codigoIdentificacion: int
        +getCopia(Condicion c1): elementoAlquiler
        +getPrecio(): int
        +getValorAlquiler(): int
    }

    class ElementoBase {
        -antiguedadMeses: int
        -descripcion: String
        -estragiaAlquier: EstrategiaCalculo
        +getCopia(Condicion c1): ElemetnoAlquiler
        +getPrecio(): int
        +getValorAlquiler(): int
    }

    class Combo {
        -antiguedadMeses: int
        -descripcion: String
        +getCopia(Condicion c1): ElemetnoAlquiler
        +getPrecio(): int
        +getValorAlquiler(): int
    }

    class ElementoObsolencia{
        -id: int
        -elemento: elementoAlquier
        -factorPrecioEnevecido: double;
        -factorAlquilerEnvejecido: double;
        +getPrecio()
        +getValorAlquiler(): int

    }

    
    class Condicion {
        <<interface>>
        +cumpleCon(elementoBase eb)
    }

    class CondicionAntiguedad {
        -antiguedad: int
        +cumpleCon(elementoBase eb)
    }

    class CondicionTexto {
        -palabra: String
        +cumpleCon(elementoBase eb)
    }

    class CondicionCodigo{
        -codigo: int
        +cumpleCon(elementoBase eb)
    }

    class CondicionAND{
        -c1,c2: Condicion
        +cumpleCon(elementoBase eb)
    }

    class CondicionOR{
        -c1,c2: Condicion
        +cumpleCon(elementoBase eb)
    }

    ElementoAlquiler <|-- ElementoBase
    ElementoAlquiler <|-- Combo
    ElementoBase <|-- ElementoObsolencia

    Condicion <|-- CondicionAntiguedad
    Condicion <|-- CondicionTexto
    Condicion <|-- CondicionCodigo
    Condicion <|-- CondicionOR
    Condicion <|-- CondicionAND

    EstrategiaCalculo <|-- CalculoAlquilerFijo
    EstrategiaCalculo <|-- CalculoAlquilerPorcentaje
    EstrategiaCalculo <|-- CalculoAlquilerPorcentajeFijo
