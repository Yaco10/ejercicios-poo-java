

```mermaid
classDiagram
    class ElementoAlquiler {
        <<abstract>>
        -codigoIdentificacion: int
        +getCopia(Condicion c1): elementoAlquiler
    }

    class ElementoBase {
        -antiguedadMeses: int
        -descripcion: String
        -estragiaAlquier: EstrategiaCalculo
        +getCopia(Condicion c1): ElemetnoAlquiler
    }

    class Combo {
        -antiguedadMeses: int
        -descripcion: String
        +getCopia(Condicion c1): ElemetnoAlquiler
    }

    class ElementoObsolencia{
        -id: int
        -elemento: elementoAlquier
        -factorPrecioEnevecido: double;
        -factorAlquilerEnvejecido: double;
        +getPrecio()
        +getCopia(Condicion c1): ElemetnoAlquiler
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
