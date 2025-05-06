package Mecanismo;

public class Definicoes {
    protected int end;

    public String getIdentifier() {
        return "Identificador";
    }
    public String getKeyWord() {
        return "Palavra Reservada";
    }
    public String getSimbol() {
        return "Símbolo";
    }
    public String getLiteral() {
        return "Literal";
    }
    public String getNumber() {
        return "Número";
    }
    public String getUndefined() {
        return "Desconhecido";
    }

    public static String _ABSOLUTE;
    public String getABSOLUTE(){ return "absolute"; }
    public final Token ABSOLUTE = new Token(_ABSOLUTE, getABSOLUTE(), getKeyWord(), getABSOLUTE(), ++end);
    
    public static String _ABSTRACT;
    public String getABSTRACT(){ return "abstract"; }
    public final Token ABSTRACT = new Token(_ABSTRACT, getABSTRACT(), getKeyWord(), getABSTRACT(), ++end);
    
    public static String _ANSICHAR;
    public String getANSICHAR(){ return "ansichar"; }
    public final Token ANSICHAR = new Token(_ANSICHAR, getANSICHAR(), getKeyWord(), getANSICHAR(), ++end);
    
    public static String _ANSISTRING;
    public String getANSISTRING(){ return "ansistring"; }
    public final Token ANSISTRING = new Token(_ANSISTRING, getANSISTRING(), getKeyWord(), getANSISTRING(), ++end);
    
    public static String _ARRAY;
    public String getARRAY(){ return "array"; }
    public final Token ARRAY = new Token(_ARRAY, getARRAY(), getKeyWord(), getARRAY(), ++end);
    
    public static String _AS;
    public String getAS(){ return "as"; }
    public final Token AS = new Token(_AS, getAS(), getKeyWord(), getAS(), ++end);
    
    public static String _ASM;
    public String getASM(){ return "asm"; }
    public final Token ASM = new Token(_ASM, getASM(), getKeyWord(), getASM(), ++end);
    
    public static String _ASSEMBLER;
    public String getASSEMBLER(){ return "assembler"; }
    public final Token ASSEMBLER = new Token(_ASSEMBLER, getASSEMBLER(), getKeyWord(), getASSEMBLER(), ++end);
    
    public static String _AUTOMATED;
    public String getAUTOMATED(){ return "automated"; }
    public final Token AUTOMATED = new Token(_AUTOMATED, getAUTOMATED(), getKeyWord(), getAUTOMATED(), ++end);
    
    public static String _BEGIN;
    public String getBEGIN(){ return "begin"; }
    public final Token BEGIN = new Token(_BEGIN, getBEGIN(), getKeyWord(), getBEGIN(), ++end);
    
    public static String _BOOLEAN;
    public String getBOOLEAN(){ return "boolean"; }
    public final Token BOOLEAN = new Token(_BOOLEAN, getBOOLEAN(), getKeyWord(), getBOOLEAN(), ++end);
    
    public static String _BREAK;
    public String getBREAK(){ return "break"; }
    public final Token BREAK = new Token(_BREAK, getBREAK(), getKeyWord(), getBREAK(), ++end);
    
    public static String _BYTE;
    public String getBYTE(){ return "byte"; }
    public final Token BYTE = new Token(_BYTE, getBYTE(), getKeyWord(), getBYTE(), ++end);
    
    public static String _CASE;
    public String getCASE(){ return "case"; }
    public final Token CASE = new Token(_CASE, getCASE(), getKeyWord(), getCASE(), ++end);
    
    public static String _CDECL;
    public String getCDECL(){ return "cdecl"; }
    public final Token CDECL = new Token(_CDECL, getCDECL(), getKeyWord(), getCDECL(), ++end);
    
    public static String _CHAR;
    public String getCHAR(){ return "char"; }
    public final Token CHAR = new Token(_CHAR, getCHAR(), getKeyWord(), getCHAR(), ++end);
    
    public static String _CLASS;
    public String getCLASS(){ return "class"; }
    public final Token CLASS = new Token(_CLASS, getCLASS(), getKeyWord(), getCLASS(), ++end);
    
    public static String _CONST;
    public String getCONST(){ return "const"; }
    public final Token CONST = new Token(_CONST, getCONST(), getKeyWord(), getCONST(), ++end);
    
    public static String _CONSTRUCTOR;
    public String getCONSTRUCTOR(){ return "constructor"; }
    public final Token CONSTRUCTOR = new Token(_CONSTRUCTOR, getCONSTRUCTOR(), getKeyWord(), getCONSTRUCTOR(), ++end);
    
    public static String _CONTINUE;
    public String getCONTINUE(){ return "continue"; }
    public final Token CONTINUE = new Token(_CONTINUE, getCONTINUE(), getKeyWord(), getCONTINUE(), ++end);
    
    public static String _CURRENCY;
    public String getCURRENCY(){ return "currency"; }
    public final Token CURRENCY = new Token(_CURRENCY, getCURRENCY(), getKeyWord(), getCURRENCY(), ++end);
    
    public static String _DEFAULT;
    public String getDEFAULT(){ return "default"; }
    public final Token DEFAULT = new Token(_DEFAULT, getDEFAULT(), getKeyWord(), getDEFAULT(), ++end);
    
    public static String _DEPRECATED;
    public String getDEPRECATED(){ return "deprecated"; }
    public final Token DEPRECATED = new Token(_DEPRECATED, getDEPRECATED(), getKeyWord(), getDEPRECATED(), ++end);
    
    public static String _DESTRUCTOR;
    public String getDESTRUCTOR(){ return "destructor"; }
    public final Token DESTRUCTOR = new Token(_DESTRUCTOR, getDESTRUCTOR(), getKeyWord(), getDESTRUCTOR(), ++end);
    
    public static String _DISPOSE;
    public String getDISPOSE(){ return "dispose"; }
    public final Token DISPOSE = new Token(_DISPOSE, getDISPOSE(), getKeyWord(), getDISPOSE(), ++end);
    
    public static String _DIV;
    public String getDIV(){ return "div"; }
    public final Token DIV = new Token(_DIV, getDIV(), getKeyWord(), getDIV(), ++end);
    
    public static String _DO;
    public String getDO(){ return "do"; }
    public final Token DO = new Token(_DO, getDO(), getKeyWord(), getDO(), ++end);
    
    public static String _DOUBLE;
    public String getDOUBLE(){ return "double"; }
    public final Token DOUBLE = new Token(_DOUBLE, getDOUBLE(), getKeyWord(), getDOUBLE(), ++end);
    
    public static String _DOWNTO;
    public String getDOWNTO(){ return "downto"; }
    public final Token DOWNTO = new Token(_DOWNTO, getDOWNTO(), getKeyWord(), getDOWNTO(), ++end);
    
    public static String _ELSE;
    public String getELSE(){ return "else"; }
    public final Token ELSE = new Token(_ELSE, getELSE(), getKeyWord(), getELSE(), ++end);
    
    public static String _END;
    public String getEND(){ return "end"; }
    public final Token END = new Token(_END, getEND(), getKeyWord(), getEND(), ++end);
    
    public static String _EXIT;
    public String getEXIT(){ return "exit"; }
    public final Token EXIT = new Token(_EXIT, getEXIT(), getKeyWord(), getEXIT(), ++end);
    
    public static String _EXPORT;
    public String getEXPORT(){ return "export"; }
    public final Token EXPORT = new Token(_EXPORT, getEXPORT(), getKeyWord(), getEXPORT(), ++end);
    
    public static String _EXTENDED;
    public String getEXTENDED(){ return "extended"; }
    public final Token EXTENDED = new Token(_EXTENDED, getEXTENDED(), getKeyWord(), getEXTENDED(), ++end);
    
    public static String _EXTERNAL;
    public String getEXTERNAL(){ return "external"; }
    public final Token EXTERNAL = new Token(_EXTERNAL, getEXTERNAL(), getKeyWord(), getEXTERNAL(), ++end);
    
    public static String _FALSE;
    public String getFALSE(){ return "false"; }
    public final Token FALSE = new Token(_FALSE, getFALSE(), getKeyWord(), getFALSE(), ++end);
    
    public static String _FAR;
    public String getFAR(){ return "far"; }
    public final Token FAR = new Token(_FAR, getFAR(), getKeyWord(), getFAR(), ++end);
    
    public static String _FILE;
    public String getFILE(){ return "file"; }
    public final Token FILE = new Token(_FILE, getFILE(), getKeyWord(), getFILE(), ++end);
    
    public static String _FINALIZATION;
    public String getFINALIZATION(){ return "finalization"; }
    public final Token FINALIZATION = new Token(_FINALIZATION, getFINALIZATION(), getKeyWord(), getFINALIZATION(), ++end);
    
    public static String _FINALIZED;
    public String getFINALIZED(){ return "finalized"; }
    public final Token FINALIZED = new Token(_FINALIZED, getFINALIZED(), getKeyWord(), getFINALIZED(), ++end);
    
    public static String _FINALLY;
    public String getFINALLY(){ return "finally"; }
    public final Token FINALLY = new Token(_FINALLY, getFINALLY(), getKeyWord(), getFINALLY(), ++end);
    
    public static String _FOR;
    public String getFOR(){ return "for"; }
    public final Token FOR = new Token(_FOR, getFOR(), getKeyWord(), getFOR(), ++end);
    
    public static String _FORWARD;
    public String getFORWARD(){ return "forward"; }
    public final Token FORWARD = new Token(_FORWARD, getFORWARD(), getKeyWord(), getFORWARD(), ++end);
    
    public static String _FUNCTION;
    public String getFUNCTION(){ return "function"; }
    public final Token FUNCTION = new Token(_FUNCTION, getFUNCTION(), getKeyWord(), getFUNCTION(), ++end);
    
    public static String _GOTO;
    public String getGOTO(){ return "goto"; }
    public final Token GOTO = new Token(_GOTO, getGOTO(), getKeyWord(), getGOTO(), ++end);
    
    public static String _IF;
    public String getIF(){ return "if"; }
    public final Token IF = new Token(_IF, getIF(), getKeyWord(), getIF(), ++end);
    
    public static String _IMPLEMENTATION;
    public String getIMPLEMENTATION(){ return "implementation"; }
    public final Token IMPLEMENTATION = new Token(_IMPLEMENTATION, getIMPLEMENTATION(), getKeyWord(), getIMPLEMENTATION(), ++end);
    
    public static String _IN;
    public String getIN(){ return "in"; }
    public final Token IN = new Token(_IN, getIN(), getKeyWord(), getIN(), ++end);
    
    public static String _INHERITED;
    public String getINHERITED(){ return "inherited"; }
    public final Token INHERITED = new Token(_INHERITED, getINHERITED(), getKeyWord(), getINHERITED(), ++end);
    
    public static String _INITIALIZATION;
    public String getINITIALIZATION(){ return "initialization"; }
    public final Token INITIALIZATION = new Token(_INITIALIZATION, getINITIALIZATION(), getKeyWord(), getINITIALIZATION(), ++end);
    
    public static String _INLINE;
    public String getINLINE(){ return "inline"; }
    public final Token INLINE = new Token(_INLINE, getINLINE(), getKeyWord(), getINLINE(), ++end);
    
    public static String _INT64;
    public String getINT64(){ return "int64"; }
    public final Token INT64 = new Token(_INT64, getINT64(), getKeyWord(), getINT64(), ++end);
    
    public static String _INTEGER;
    public String getINTEGER(){ return "integer"; }
    public final Token INTEGER = new Token(_INTEGER, getINTEGER(), getKeyWord(), getINTEGER(), ++end);
    
    public static String _INTERFACE;
    public String getINTERFACE(){ return "interface"; }
    public final Token INTERFACE = new Token(_INTERFACE, getINTERFACE(), getKeyWord(), getINTERFACE(), ++end);
    
    public static String _INTERRUPT;
    public String getINTERRUPT(){ return "interrupt"; }
    public final Token INTERRUPT = new Token(_INTERRUPT, getINTERRUPT(), getKeyWord(), getINTERRUPT(), ++end);
    
    public static String _IS;
    public String getIS(){ return "is"; }
    public final Token IS = new Token(_IS, getIS(), getKeyWord(), getIS(), ++end);
    
    public static String _LABEL;
    public String getLABEL(){ return "label"; }
    public final Token LABEL = new Token(_LABEL, getLABEL(), getKeyWord(), getLABEL(), ++end);
    
    public static String _LIBRARY;
    public String getLIBRARY(){ return "library"; }
    public final Token LIBRARY = new Token(_LIBRARY, getLIBRARY(), getKeyWord(), getLIBRARY(), ++end);
    
    public static String _LONGINT;
    public String getLONGINT(){ return "longint"; }
    public final Token LONGINT = new Token(_LONGINT, getLONGINT(), getKeyWord(), getLONGINT(), ++end);
    
    public static String _LONGWORD;
    public String getLONGWORD(){ return "longword"; }
    public final Token LONGWORD = new Token(_LONGWORD, getLONGWORD(), getKeyWord(), getLONGWORD(), ++end);
    
    public static String _MESSAGE;
    public String getMESSAGE(){ return "message"; }
    public final Token MESSAGE = new Token(_MESSAGE, getMESSAGE(), getKeyWord(), getMESSAGE(), ++end);
    
    public static String _MOD;
    public String getMOD(){ return "mod"; }
    public final Token MOD = new Token(_MOD, getMOD(), getKeyWord(), getMOD(), ++end);
    
    public static String _NEAR;
    public String getNEAR(){ return "near"; }
    public final Token NEAR = new Token(_NEAR, getNEAR(), getKeyWord(), getNEAR(), ++end);
    
    public static String _NEW;
    public String getNEW(){ return "new"; }
    public final Token NEW = new Token(_NEW, getNEW(), getKeyWord(), getNEW(), ++end);
    
    public static String _NIL;
    public String getNIL(){ return "nil"; }
    public final Token NIL = new Token(_NIL, getNIL(), getKeyWord(), getNIL(), ++end);
    
    public static String _NODEFAULT;
    public String getNODEFAULT(){ return "nodefault"; }
    public final Token NODEFAULT = new Token(_NODEFAULT, getNODEFAULT(), getKeyWord(), getNODEFAULT(), ++end);
    
    public static String _OBJECT;
    public String getOBJECT(){ return "object"; }
    public final Token OBJECT = new Token(_OBJECT, getOBJECT(), getKeyWord(), getOBJECT(), ++end);
    
    public static String _OF;
    public String getOF(){ return "of"; }
    public final Token OF = new Token(_OF, getOF(), getKeyWord(), getOF(), ++end);
    
    public static String _OPERATOR;
    public String getOPERATOR(){ return "operator"; }
    public final Token OPERATOR = new Token(_OPERATOR, getOPERATOR(), getKeyWord(), getOPERATOR(), ++end);
    
    public static String _OVERLOAD;
    public String getOVERLOAD(){ return "overload"; }
    public final Token OVERLOAD = new Token(_OVERLOAD, getOVERLOAD(), getKeyWord(), getOVERLOAD(), ++end);
    
    public static String _OVERRIDE;
    public String getOVERRIDE(){ return "override"; }
    public final Token OVERRIDE = new Token(_OVERRIDE, getOVERRIDE(), getKeyWord(), getOVERRIDE(), ++end);
    
    public static String _PACKED;
    public String getPACKED(){ return "packed"; }
    public final Token PACKED = new Token(_PACKED, getPACKED(), getKeyWord(), getPACKED(), ++end);
    
    public static String _PASCAL;
    public String getPASCAL(){ return "pascal"; }
    public final Token PASCAL = new Token(_PASCAL, getPASCAL(), getKeyWord(), getPASCAL(), ++end);
    
    public static String _PLATFORM;
    public String getPLATFORM(){ return "platform"; }
    public final Token PLATFORM = new Token(_PLATFORM, getPLATFORM(), getKeyWord(), getPLATFORM(), ++end);
    
    public static String _PRIVATE;
    public String getPRIVATE(){ return "private"; }
    public final Token PRIVATE = new Token(_PRIVATE, getPRIVATE(), getKeyWord(), getPRIVATE(), ++end);
    
    public static String _PROCEDURE;
    public String getPROCEDURE(){ return "procedure"; }
    public final Token PROCEDURE = new Token(_PROCEDURE, getPROCEDURE(), getKeyWord(), getPROCEDURE(), ++end);
    
    public static String _PROGRAM;
    public String getPROGRAM(){ return "program"; }
    public final Token PROGRAM = new Token(_PROGRAM, getPROGRAM(), getKeyWord(), getPROGRAM(), ++end);
    
    public static String _PROPERTY;
    public String getPROPERTY(){ return "property"; }
    public final Token PROPERTY = new Token(_PROPERTY, getPROPERTY(), getKeyWord(), getPROPERTY(), ++end);
    
    public static String _PROTECTED;
    public String getPROTECTED(){ return "protected"; }
    public final Token PROTECTED = new Token(_PROTECTED, getPROTECTED(), getKeyWord(), getPROTECTED(), ++end);
    
    public static String _PUBLIC;
    public String getPUBLIC(){ return "public"; }
    public final Token PUBLIC = new Token(_PUBLIC, getPUBLIC(), getKeyWord(), getPUBLIC(), ++end);
    
    public static String _PUBLISHED;
    public String getPUBLISHED(){ return "published"; }
    public final Token PUBLISHED = new Token(_PUBLISHED, getPUBLISHED(), getKeyWord(), getPUBLISHED(), ++end);
    
    public static String _RAISE;
    public String getRAISE(){ return "raise"; }
    public final Token RAISE = new Token(_RAISE, getRAISE(), getKeyWord(), getRAISE(), ++end);
    
    public static String _READ;
    public String getREAD(){ return "read"; }
    public final Token READ = new Token(_READ, getREAD(), getKeyWord(), getREAD(), ++end);

    public static String _READLN;
    public String getREADLN(){ return "readln"; }
    public final Token READLN = new Token(_READLN, getREADLN(), getKeyWord(), getREADLN(), ++end);

    public static String _READONLY;
    public String getREADONLY(){ return "readonly"; }
    public final Token READONLY = new Token(_READONLY, getREADONLY(), getKeyWord(), getREADONLY(), ++end);
    
    public static String _REAL;
    public String getREAL(){ return "real"; }
    public final Token REAL = new Token(_REAL, getREAL(), getKeyWord(), getREAL(), ++end);
    
    public static String _RECORD;
    public String getRECORD(){ return "record"; }
    public final Token RECORD = new Token(_RECORD, getRECORD(), getKeyWord(), getRECORD(), ++end);
    
    public static String _REGISTER;
    public String getREGISTER(){ return "register"; }
    public final Token REGISTER = new Token(_REGISTER, getREGISTER(), getKeyWord(), getREGISTER(), ++end);
    
    public static String _REINTRODUCE;
    public String getREINTRODUCE(){ return "reintroduce"; }
    public final Token REINTRODUCE = new Token(_REINTRODUCE, getREINTRODUCE(), getKeyWord(), getREINTRODUCE(), ++end);
    
    public static String _REPEAT;
    public String getREPEAT(){ return "repeat"; }
    public final Token REPEAT = new Token(_REPEAT, getREPEAT(), getKeyWord(), getREPEAT(), ++end);
    
    public static String _REQUIRES;
    public String getREQUIRES(){ return "requires"; }
    public final Token REQUIRES = new Token(_REQUIRES, getREQUIRES(), getKeyWord(), getREQUIRES(), ++end);
    
    public static String _RESIDENT;
    public String getRESIDENT(){ return "resident"; }
    public final Token RESIDENT = new Token(_RESIDENT, getRESIDENT(), getKeyWord(), getRESIDENT(), ++end);
    
    public static String _RESOURCESTRING;
    public String getRESOURCESTRING(){ return "resourcestring"; }
    public final Token RESOURCESTRING = new Token(_RESOURCESTRING, getRESOURCESTRING(), getKeyWord(), getRESOURCESTRING(), ++end);
    
    public static String _SAFECALL;
    public String getSAFECALL(){ return "safecall"; }
    public final Token SAFECALL = new Token(_SAFECALL, getSAFECALL(), getKeyWord(), getSAFECALL(), ++end);
    
    public static String _SEALED;
    public String getSEALED(){ return "sealed"; }
    public final Token SEALED = new Token(_SEALED, getSEALED(), getKeyWord(), getSEALED(), ++end);
    
    public static String _SELF;
    public String getSELF(){ return "self"; }
    public final Token SELF = new Token(_SELF, getSELF(), getKeyWord(), getSELF(), ++end);
    
    public static String _SET;
    public String getSET(){ return "set"; }
    public final Token SET = new Token(_SET, getSET(), getKeyWord(), getSET(), ++end);
    
    public static String _SHL;
    public String getSHL(){ return "shl"; }
    public final Token SHL = new Token(_SHL, getSHL(), getKeyWord(), getSHL(), ++end);
    
    public static String _SHORTINT;
    public String getSHORTINT(){ return "shortint"; }
    public final Token SHORTINT = new Token(_SHORTINT, getSHORTINT(), getKeyWord(), getSHORTINT(), ++end);
    
    public static String _SHORTSTRING;
    public String getSHORTSTRING(){ return "shortstring"; }
    public final Token SHORTSTRING = new Token(_SHORTSTRING, getSHORTSTRING(), getKeyWord(), getSHORTSTRING(), ++end);
    
    public static String _SHR;
    public String getSHR(){ return "shr"; }
    public final Token SHR = new Token(_SHR, getSHR(), getKeyWord(), getSHR(), ++end);
    
    public static String _SINGLE;
    public String getSINGLE(){ return "single"; }
    public final Token SINGLE = new Token(_SINGLE, getSINGLE(), getKeyWord(), getSINGLE(), ++end);
    
    public static String _SMALLINT;
    public String getSMALLINT(){ return "smallint"; }
    public final Token SMALLINT = new Token(_SMALLINT, getSMALLINT(), getKeyWord(), getSMALLINT(), ++end);
    
    public static String _STDCALL;
    public String getSTDCALL(){ return "stdcall"; }
    public final Token STDCALL = new Token(_STDCALL, getSTDCALL(), getKeyWord(), getSTDCALL(), ++end);
    
    public static String _STRICT;
    public String getSTRICT(){ return "strict"; }
    public final Token STRICT = new Token(_STRICT, getSTRICT(), getKeyWord(), getSTRICT(), ++end);
    
    public static String _STRING;
    public String getSTRING(){ return "string"; }
    public final Token STRING = new Token(_STRING, getSTRING(), getKeyWord(), getSTRING(), ++end);
    
    public static String _THEN;
    public String getTHEN(){ return "then"; }
    public final Token THEN = new Token(_THEN, getTHEN(), getKeyWord(), getTHEN(), ++end);
    
    public static String _THREADVAR;
    public String getTHREADVAR(){ return "threadvar"; }
    public final Token THREADVAR = new Token(_THREADVAR, getTHREADVAR(), getKeyWord(), getTHREADVAR(), ++end);
    
    public static String _TO;
    public String getTO(){ return "to"; }
    public final Token TO = new Token(_TO, getTO(), getKeyWord(), getTO(), ++end);
    
    public static String _TRUE;
    public String getTRUE(){ return "true"; }
    public final Token TRUE = new Token(_TRUE, getTRUE(), getKeyWord(), getTRUE(), ++end);
    
    public static String _TRY;
    public String getTRY(){ return "try"; }
    public final Token TRY = new Token(_TRY, getTRY(), getKeyWord(), getTRY(), ++end);
    
    public static String _TYPE;
    public String getTYPE(){ return "type"; }
    public final Token TYPE = new Token(_TYPE, getTYPE(), getKeyWord(), getTYPE(), ++end);
    
    public static String _UINT64;
    public String getUINT64(){ return "uint64"; }
    public final Token UINT64 = new Token(_UINT64, getUINT64(), getKeyWord(), getUINT64(), ++end);
    
    public static String _UNICODESTRING;
    public String getUNICODESTRING(){ return "unicodestring"; }
    public final Token UNICODESTRING = new Token(_UNICODESTRING, getUNICODESTRING(), getKeyWord(), getUNICODESTRING(), ++end);
    
    public static String _UNIT;
    public String getUNIT(){ return "unit"; }
    public final Token UNIT = new Token(_UNIT, getUNIT(), getKeyWord(), getUNIT(), ++end);
    
    public static String _UNTIL;
    public String getUNTIL(){ return "until"; }
    public final Token UNTIL = new Token(_UNTIL, getUNTIL(), getKeyWord(), getUNTIL(), ++end);
    
    public static String _USES;
    public String getUSES(){ return "uses"; }
    public final Token USES = new Token(_USES, getUSES(), getKeyWord(), getUSES(), ++end);
    
    public static String _VAR;
    public String getVAR(){ return "var"; }
    public final Token VAR = new Token(_VAR, getVAR(), getKeyWord(), getVAR(), ++end);
    
    public static String _VARARGS;
    public String getVARARGS(){ return "varargs"; }
    public final Token VARARGS = new Token(_VARARGS, getVARARGS(), getKeyWord(), getVARARGS(), ++end);
    
    public static String _VIRTUAL;
    public String getVIRTUAL(){ return "virtual"; }
    public final Token VIRTUAL = new Token(_VIRTUAL, getVIRTUAL(), getKeyWord(), getVIRTUAL(), ++end);
    
    public static String _WHILE;
    public String getWHILE(){ return "while"; }
    public final Token WHILE = new Token(_WHILE, getWHILE(), getKeyWord(), getWHILE(), ++end);
    
    public static String _WIDECHAR;
    public String getWIDECHAR(){ return "widechar"; }
    public final Token WIDECHAR = new Token(_WIDECHAR, getWIDECHAR(), getKeyWord(), getWIDECHAR(), ++end);
    
    public static String _WIDESTRING;
    public String getWIDESTRING(){ return "widestring"; }
    public final Token WIDESTRING = new Token(_WIDESTRING, getWIDESTRING(), getKeyWord(), getWIDESTRING(), ++end);
    
    public static String _WITH;
    public String getWITH(){ return "with"; }
    public final Token WITH = new Token(_WITH, getWITH(), getKeyWord(), getWITH(), ++end);
    
    public static String _WORD;
    public String getWORD(){ return "word"; }
    public final Token WORD = new Token(_WORD, getWORD(), getKeyWord(), getWORD(), ++end);
    
    public static String _WRITE;
    public String getWRITE(){ return "write"; }
    public final Token WRITE = new Token(_WRITE, getWRITE(), getKeyWord(), getWRITE(), ++end);

    public static String _WRITELN;
    public String getWRITELN(){ return "writeln"; }
    public final Token WRITELN = new Token(_WRITELN, getWRITELN(), getKeyWord(), getWRITELN(), ++end);

    public static String _XOR;
    public String getXOR(){ return "xor"; }
    public final Token XOR = new Token(_XOR, getXOR(), getKeyWord(), getXOR(), ++end);
    
    public static String _AND;
    public String getAND(){ return "and"; }
    public final Token AND = new Token(_AND, getAND(), getKeyWord(), getAND(), ++end);
    
    public static String _OR;
    public String getOR(){ return "or"; }
    public final Token OR = new Token(_OR, getOR(), getKeyWord(), getOR(), ++end);
    
    public static String _NOT;
    public String getNOT(){ return "not"; }
    public final Token NOT = new Token(_NOT, getNOT(), getKeyWord(), getNOT(), ++end);

    public static String _DOT; // .
    public String getDOT(){ return "."; }
    public final Token DOT = new Token(_DOT, getDOT(), getSimbol(), getDOT(), ++end);

    public static String _COMMA; // ,
    public String getCOMMA(){ return ","; }
    public final Token COMMA = new Token(_COMMA, getCOMMA(), getSimbol(), getCOMMA(), ++end);

    public static String _SEMICOLON; // ;
    public String getSEMICOLON(){ return ";"; }
    public final Token SEMICOLON = new Token(_SEMICOLON, getSEMICOLON(), getSimbol(), getSEMICOLON(), ++end);

    public static String _COLON; // :
    public String getCOLON(){ return ","; }
    public final Token COLON = new Token(_COLON, getCOLON(), getSimbol(), getCOLON(), ++end);

    public static String _DOUBLECOLON; // ::
    public String getDOUBLECOLON(){ return ";"; }
    public final Token DOUBLECOLON = new Token(_DOUBLECOLON, getDOUBLECOLON(), getSimbol(), getDOUBLECOLON(), ++end);

    public static String _ASSIGNMENT_OPERATOR; // :=
    public String getASSIGNMENT_OPERATOR(){ return ":="; }
    public final Token ASSIGNMENT_OPERATOR = new Token(_ASSIGNMENT_OPERATOR, getASSIGNMENT_OPERATOR(), getSimbol(), getASSIGNMENT_OPERATOR(), ++end);

    public static String _DOUBLE_DOT; // ..
    public String getDOUBLE_DOT(){ return ".."; }
    public final Token DOUBLE_DOT = new Token(_DOUBLE_DOT, getDOUBLE_DOT(), getSimbol(), getDOUBLE_DOT(), ++end);

    public static String _SINGLE_QUOTE; // '
    public String getSINGLE_QUOTE(){ return "'"; }
    public final Token SINGLE_QUOTE = new Token(_SINGLE_QUOTE, getSINGLE_QUOTE(), getSimbol(), getSINGLE_QUOTE(), ++end);

    public static String _DOUBLE_QUOTE; // "
    public String getDOUBLE_QUOTE(){ return "\""; }
    public final Token DOUBLE_QUOTE = new Token(_DOUBLE_QUOTE, getDOUBLE_QUOTE(), getSimbol(), getDOUBLE_QUOTE(), ++end);

    public static String _LEFT_PARENTHESES; // (
    public String getLEFT_PARENTHESES(){ return "("; }
    public final Token LEFT_PARENTHESES = new Token(_LEFT_PARENTHESES, getLEFT_PARENTHESES(), getSimbol(), getLEFT_PARENTHESES(), ++end);

    public static String _RIGHT_PARENTHESES; // )
    public String getRIGHT_PARENTHESES(){ return ")"; }
    public final Token RIGHT_PARENTHESES = new Token(_RIGHT_PARENTHESES, getRIGHT_PARENTHESES(), getSimbol(), getRIGHT_PARENTHESES(), ++end);

    public static String _LEFT_AND_RIGHT_PARENTHESES; // ()
    public String getLEFT_AND_RIGHT_PARENTHESES(){ return "()"; }
    public final Token LEFT_AND_RIGHT_PARENTHESES = new Token(_LEFT_AND_RIGHT_PARENTHESES, getLEFT_AND_RIGHT_PARENTHESES(), getSimbol(), getLEFT_AND_RIGHT_PARENTHESES(), ++end);
    
    public static String _LEFT_BRACKETS; // [
    public String getLEFT_BRACKETS(){ return "["; }
    public final Token LEFT_BRACKETS = new Token(_LEFT_BRACKETS, getLEFT_BRACKETS(), getSimbol(), getLEFT_BRACKETS(), ++end);
    
    public static String _RIGHT_BRACKETS; // ]
    public String getRIGHT_BRACKETS(){ return "]"; }
    public final Token RIGHT_BRACKETS = new Token(_RIGHT_BRACKETS, getRIGHT_BRACKETS(), getSimbol(), getRIGHT_BRACKETS(), ++end);

    public static String _LEFT_AND_RIGHT_BRACKETS; // []
    public String getLEFT_AND_RIGHT_BRACKETS(){ return "[]"; }
    public final Token LEFT_AND_RIGHT_BRACKETS = new Token(_LEFT_AND_RIGHT_BRACKETS, getLEFT_AND_RIGHT_BRACKETS(), getSimbol(), getLEFT_AND_RIGHT_BRACKETS(), ++end);

    public static String _LEFT_BRACES; // {
    public String getLEFT_BRACES(){ return "{"; }
    public final Token LEFT_BRACES = new Token(_LEFT_BRACES, getLEFT_BRACES(), getSimbol(), getLEFT_BRACES(), ++end);

    public static String _RIGHT_BRACES; // }
    public String getRIGHT_BRACES(){ return "}"; }
    public final Token RIGHT_BRACES = new Token(_RIGHT_BRACES, getRIGHT_BRACES(), getSimbol(), getRIGHT_BRACES(), ++end);

    public static String _LEFT_AND_RIGHT_BRACES; // {}
    public String getLEFT_AND_RIGHT_BRACES(){ return "{}"; }
    public final Token LEFT_AND_RIGHT_BRACES = new Token(_LEFT_AND_RIGHT_BRACES, getLEFT_AND_RIGHT_BRACES(), getSimbol(), getLEFT_AND_RIGHT_BRACES(), ++end);

    public static String _EQUAL_SIGN; // =
    public String getEQUAL_SIGN(){ return "="; }
    public final Token EQUAL_SIGN = new Token(_EQUAL_SIGN, getEQUAL_SIGN(), getSimbol(), getEQUAL_SIGN(), ++end);

    public static String _GREATER_THAN_SIGN; // >
    public String getGREATER_THAN_SIGN(){ return ">"; }
    public final Token GREATER_THAN_SIGN = new Token(_GREATER_THAN_SIGN, getGREATER_THAN_SIGN(), getSimbol(), getGREATER_THAN_SIGN(), ++end);

    public static String _LESS_THAN_SIGN; // <
    public String getLESS_THAN_SIGN(){ return "<"; }
    public final Token LESS_THAN_SIGN = new Token(_LESS_THAN_SIGN, getLESS_THAN_SIGN(), getSimbol(), getLESS_THAN_SIGN(), ++end);

    public static String _GREATER_THAN_OR_EQUAL_TO_SIGN; // >=
    public String getGREATER_THAN_OR_EQUAL_TO_SIGN(){ return ">="; }
    public final Token GREATER_THAN_OR_EQUAL_TO_SIGN = new Token(_GREATER_THAN_OR_EQUAL_TO_SIGN, getGREATER_THAN_OR_EQUAL_TO_SIGN(), getSimbol(), getGREATER_THAN_OR_EQUAL_TO_SIGN(), ++end);

    public static String _LESS_THAN_OR_EQUAL_TO_SIGN; // <=
    public String getLESS_THAN_OR_EQUAL_TO_SIGN(){ return "<="; }
    public final Token LESS_THAN_OR_EQUAL_TO_SIGN = new Token(_LESS_THAN_OR_EQUAL_TO_SIGN, getLESS_THAN_OR_EQUAL_TO_SIGN(), getSimbol(), getLESS_THAN_OR_EQUAL_TO_SIGN(), ++end);
    
    public static String _NOT_EQUAL_TO_SIGN; // <>
    public String getNOT_EQUAL_TO_SIGN(){ return "<>"; }
    public final Token NOT_EQUAL_TO_SIGN = new Token(_NOT_EQUAL_TO_SIGN, getNOT_EQUAL_TO_SIGN(), getSimbol(), getNOT_EQUAL_TO_SIGN(), ++end);

    public static String _PLUS_SIGN; // +
    public String getPLUS_SIGN(){ return "+"; }
    public final Token PLUS_SIGN = new Token(_PLUS_SIGN, getPLUS_SIGN(), getSimbol(), getPLUS_SIGN(), ++end);
    
    public static String _MINUS_SIGN; // -
    public String getMINUS_SIGN(){ return "-"; }
    public final Token MINUS_SIGN = new Token(_MINUS_SIGN, getMINUS_SIGN(), getSimbol(), getMINUS_SIGN(), ++end);

    public static String _ASTERISK_OR_MULTIPLICATION_SIGN; // *
    public String getASTERISK_OR_MULTIPLICATION_SIGN(){ return "*"; }
    public final Token ASTERISK_OR_MULTIPLICATION_SIGN = new Token(_ASTERISK_OR_MULTIPLICATION_SIGN, getASTERISK_OR_MULTIPLICATION_SIGN(), getSimbol(), getASTERISK_OR_MULTIPLICATION_SIGN(), ++end);

    public static String _FORWARD_SLASH_OR_DIVISION_SIGN; // /
    public String getFORWARD_SLASH_OR_DIVISION_SIGN(){ return "/"; }
    public final Token FORWARD_SLASH_OR_DIVISION_SIGN = new Token(_FORWARD_SLASH_OR_DIVISION_SIGN, getFORWARD_SLASH_OR_DIVISION_SIGN(), getSimbol(), getFORWARD_SLASH_OR_DIVISION_SIGN(), ++end);

    public static String _CARET_OR_EXPONENTIATION_SIGN; // ^
    public String getCARET_OR_EXPONENTIATION_SIGN(){ return "^"; }
    public final Token CARET_OR_EXPONENTIATION_SIGN = new Token(_CARET_OR_EXPONENTIATION_SIGN, getCARET_OR_EXPONENTIATION_SIGN(), getSimbol(), getCARET_OR_EXPONENTIATION_SIGN(), ++end);

    public static String _PERCENT_SIGN; // %
    public String getPERCENT_SIGN(){ return "%"; }
    public final Token PERCENT_SIGN = new Token(_PERCENT_SIGN, getPERCENT_SIGN(), getSimbol(), getPERCENT_SIGN(), ++end);
}
