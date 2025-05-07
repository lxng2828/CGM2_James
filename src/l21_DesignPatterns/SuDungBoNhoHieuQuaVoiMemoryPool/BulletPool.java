package l21_DesignPatterns.SuDungBoNhoHieuQuaVoiMemoryPool;

public class BulletPool extends MemoryPool<Bullet> {
    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}