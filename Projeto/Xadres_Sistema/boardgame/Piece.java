package Projeto.Xadres_Sistema.boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Pode colocar por preferencial
        // Por padrão, o java já seta como valor nulo
    }

    // Será acesso somente dentro do pacote Tabuleiro e pelas subclasses de Piece
    protected Board getBoard() {
        return board;
    }
}
