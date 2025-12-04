package edu.iaun.exceptions;

public class Matrix {
    public static int determinant(int[][] mat) {
        if(mat.length != mat[0].length)
            throw new MatrixException("Matrix is not square");
        if(mat.length != 2)
            throw new MatrixException("Unsupported matrix");
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    public static void main(String[] args) {
//        int[][] matrix = {{10,20,30} , {30, 40, 50}, {40,50,60}};
        int[][] matrix = {{10,20} , {30, 40}};
        try {
            System.out.println(determinant(matrix));
        }catch (MatrixException e){
            System.out.println(e.getMessage());
        }
    }
}
