# mips-architecture

16 Bit Single Cycle MIPS  Architecture

- Instruction bits = 16
- Register Address bits = 3


Instruction Formate:
    
    R-type: Opcode(3) RS(3) RT(3) RD(3) Func(4)

    I-type: Opcode(3) RS(3) RT(3) Immediate-Value(7)

    J-type: Opcode(3) Immediate-Value(13)

8 Operation:
    
    R-type:
        AND:    000(OP code)    0100(Function)
        OR:     000(OP code)    0101(Function)
        ADD:    000(OP code)    0000(Function)
        SUB:    000(OP code)    0010(Function)

    I-type: (Immediate Value = 7 bits)
        LW:     001(OP code)
        SW:     010(OP code)
        Beq:    011(OP code)

    J-type: (Immediate Value = 13 bits)
        Jump:   100(OP code)



