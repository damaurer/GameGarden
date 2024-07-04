<script>
	import { onMount } from 'svelte';
	import keycloak from './auth.js';
	export let name;

	let isAuth = false;

	onMount(async () => {
		await keycloak.init({ onLoad: 'login-required' }).then((auth) => {
			if()
		})
		isAuth = true;
	});
</script>

<main>
	{#if isAuth}
		<h1>Hello {name}!</h1>
		<h1>Welcome to the app!</h1>
	{:else}
		<h1>Please wait...</h1>
	{/if}
</main>

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}

	h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	}

	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>