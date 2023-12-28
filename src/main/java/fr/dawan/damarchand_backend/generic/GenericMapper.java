package fr.dawan.damarchand_backend.generic;

public interface GenericMapper<E,D> {
    D toDto(E entity);
    E toEntity(D dto);
}
