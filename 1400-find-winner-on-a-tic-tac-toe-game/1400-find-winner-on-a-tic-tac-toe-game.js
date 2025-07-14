/**
 * @param {number[][]} moves
 * @return {string}
 */
var tictactoe = function(moves) {
    const board = Array(9).fill("E");
    const winnerCombos = [
        [0,1,2], [3,4,5], [6,7,8],     // Rows
        [0,3,6], [1,4,7], [2,5,8],     // Cols
        [0,4,8], [2,4,6]               // Diagonals
    ];
    
    // Apply moves to the board
    for (let i = 0; i < moves.length; i++) {
        const player = i % 2 === 0 ? 'A' : 'B';
        const [row, col] = moves[i];
        const idx = row * 3 + col;
        board[idx] = player;
    }

    // Check for winner
    for (const [a, b, c] of winnerCombos) {
        if (board[a] !== "E" && board[a] === board[b] && board[b] === board[c]) {
            return board[a];
        }
    }

    return moves.length === 9 ? "Draw" : "Pending";
};