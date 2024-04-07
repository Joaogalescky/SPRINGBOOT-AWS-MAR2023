package Projeto.Xadres_Sistema.chess;

import Projeto.Xadres_Sistema.boardgame.Board;
import Projeto.Xadres_Sistema.boardgame.Piece;
import Projeto.Xadres_Sistema.boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece(Position Position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
