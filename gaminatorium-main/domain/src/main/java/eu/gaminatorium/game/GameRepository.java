package eu.gaminatorium.game;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface GameRepository {

    Game save(Game game);
    Page<Game> findAll(Pageable pageable);
    Page<Game.Rating> findAllRatingsByGameId(@Param("gameId") Long gameId, Pageable pageable);
    Page<Game.Active> findAllActiveGamesByGameId(@Param("gameId") Long gameId, Pageable pageable);
    Game findById(long id);
    Game.Active findActiveByTitle(String title);
    Game.Active save(Game.Active active);
    Game.Rating save(Game.Rating rating);
    Page<Game> findAllByTitle(String title, Pageable pageable);
    Page<Game> findAllByTitleIsContainingIgnoreCase(String title, Pageable pageable);
    Page<Game> findAllByModerationStatusIs(Game.ModerationStatus moderationStatus, Pageable pageable);
    Page<Game.Active> findActiveByTitle(String title, Pageable pageable);
    void deleteById(long id);
    int countAllByModerationStatus(Game.ModerationStatus moderationStatus);
    boolean existsById(long id);
    boolean existsByTitle(String title);
}
