<script lang="ts">
	import SymptomeSimpleComponnent from '$lib/componnents/symptome/SymptomeSimpleComponnent.svelte';
	import type { PageData } from './$types';

	export let data: PageData;
	$: symptomes = data.symptopmes;
</script>

{#each symptomes as item}
	<SymptomeSimpleComponnent data={item} />
{/each}
