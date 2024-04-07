package Projeto.Xadres_Sistema.chess;

import Projeto.Xadres_Sistema.boardgame.BoardException;

public class ChessException extends BoardException {

    private static final long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
