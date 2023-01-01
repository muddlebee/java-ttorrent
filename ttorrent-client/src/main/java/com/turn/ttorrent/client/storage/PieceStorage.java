package com.turn.ttorrent.client.storage;

import java.io.Closeable;
import java.io.IOException;
import java.util.BitSet;

/**
 * Using BitSet
 * Accumulate and store the pieces received from the peers
 *
 */
public interface PieceStorage extends Closeable {

  /**
   *
   *
   *
   * @param pieceIndex
   * @param pieceData
   * @throws IOException
   */
  void savePiece(int pieceIndex, byte[] pieceData) throws IOException;

  byte[] readPiecePart(int pieceIndex, int offset, int length) throws IOException;

  BitSet getAvailablePieces();

  boolean isFinished();

  void closeFully() throws IOException;

}
