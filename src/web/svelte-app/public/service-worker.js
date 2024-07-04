// public/service-worker.js

self.addEventListener('install', async e => {
    const cache = await caches.open('gameengine-svelte');
    await cache.addAll([
        '/index.html',
        '/global.css',
        '/build/bundle.css',
        '/build/bundle.js',
    ]);
});

self.addEventListener('fetch', async e => {
    const req = e.request;
    return fetch(req)

    // e.respondWith(caches.match(req).then(cachedResponse => {
    //     return cachedResponse || fetch(req);
    // }));
});